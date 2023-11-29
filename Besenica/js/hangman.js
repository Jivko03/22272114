/*
* Hangman game.
*
* NOTE!!!
* This file is in UTF-8 encoding and when included in the html should be specified.
*
* Copyright Slovored.com (c) 2009
*/

var hangmanWord;
var hangmanCategory;
var hangmanWrongLetters;
var hangmanCorrectLetters;
var hangmanImages;


// Preload hangman images for faster speed
hangmanImages = new Array(10);
for (var i = 0; i < 11; i++) {
	hangmanImages[i] = new Image();
	hangmanImages[i].src = "/images/hangman/hangman" + i + ".png";
}


function checkLetter() {
	var form = document.forms.control;
	var lett = form.letter.value.toUpperCase();
	form.letter.value = "";
	if (lett == "") {
		alert("Трябва да въведете буква!");
		return false;
	}
	if (hangmanCategory < 10) {
		// Then expect Bulgarian letter
		var regex = /[а-я]/i;
		if (isChrome) {
			// Bug in old versions of Chrome
			regex = /[а-яА-Я]/;
		}
		if (!regex.test(lett)) {
			alert("Играете за дума на български език и въведената буква трява да е от българската азбука!");
			return false;
		}
	} else {
		// Else expect English letter
		var regex = /[a-z]/i;
		if (!regex.test(lett)) {
			alert("Играете за дума на английски език и въведената буква трява да е от английската азбука!");
			return false;
		}
	}

	// Check that letter exists in word
	var hit = false;
	for (var i = 0; i < hangmanWord.length; i++) {
		if (hangmanWord.charAt(i) == lett) {
			hangmanCorrectLetters[i] = lett;
			document.getElementById("hmLetter" + i).innerHTML = lett;
			hit = true;
		}
	}

	if (hit) {
		// Check for game over - player wins
		var win = true;
		for (var i = 0; i < hangmanWord.length; i++) {
			if (hangmanCorrectLetters[i] == "") {
				win = false;
			}
		}
		if (win) {
			alert("Поздравления - познахте думата!");
			document.getElementById("letter").disabled = true;
		}
		return false;
	}

	// Check that letter exist in wrong letters
	var used = false;
	for (var i = 0; i < 10; i++) {
		if (hangmanWrongLetters[i] == lett) {
			used = true;
		}
	}

	if (used) {
		alert("Пробвали сте буквата \"" + lett + "\" вече!");
		return false;
	}

	// Populate wrong letter
	var lastWrong = 0;
	for (var i = 0; i < 10; i++) {
		if (hangmanWrongLetters[i] == "") {
			lastWrong = i;
			break;
		}
	}
	hangmanWrongLetters[lastWrong] = lett;
	document.getElementById("hmWrong" + lastWrong).innerHTML = lett;

	// Update picture - get source from preloaded images
	document.getElementById("hmImage").src = hangmanImages[lastWrong + 1].src;

	// Check for game over - player loses
	if (lastWrong == 9) {
		document.getElementById("letter").disabled = true;
		for (var i = 0; i < hangmanWord.length; i++) {
			document.getElementById("hmLetter" + i).innerHTML = hangmanWord.charAt(i);
		}
		alert("Загубихте играта! Думата е " + hangmanWord + "!");
	}

	return false;
}


function startNewGame() {
	var form = document.forms.control;
	hangmanCategory = form.category.options[form.category.selectedIndex].value;
	var req = "/action/hangman?categoryId=" + hangmanCategory;
	jx.load(req, replaceWord);
}


function replaceWord(word) {
	if (word != null && word != "") {
		hangmanWord = word.toUpperCase();
		hangmanWrongLetters = new Array(10);
		hangmanCorrectLetters = new Array(hangmanWord.length);

		// Make wrong letters empty
		for (var i = 0; i < 10; i++) {
			document.getElementById("hmWrong" + i).innerHTML = "";
			hangmanWrongLetters[i] = "";
		}

		// Make zero previous word
		for (var i = 0; i < 21; i++) {
			var l = document.getElementById("hmLetter" + i);
			l.innerHTML = "";
			l.style.display = "none";
			l.style.visibility = "hidden";
		}

		// Generate word that needs to be guessed
		for (var i = 0; i < hangmanWord.length; i++) {
			hangmanCorrectLetters[i] = "";
			var l = document.getElementById("hmLetter" + i);
			l.style.display = "block";
			if (hangmanWord.charAt(i) != " ") {
				l.style.visibility = "visible";
			} else {
				hangmanCorrectLetters[i] = " ";
			}
		}

		// Reset picture - get source from preloaded images
		document.getElementById("hmImage").src = hangmanImages[0].src;

		// Enable input element, clear text if exist and set focus
		var l = document.getElementById("letter");
		l.disabled = false;
		l.value = "";
		l.focus();
	}
}

