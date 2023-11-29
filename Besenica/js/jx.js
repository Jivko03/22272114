// V3.01.A - http://www.openjs.com/scripts/jx/
// Formated for better reading plus some improvements
jx = {

	// Create a xmlHttpRequest object - this is the constructor.
	getHTTPObject : function() {
		var http = false;
		// Use IE's ActiveX items to load the file.
		if (typeof ActiveXObject != 'undefined') {
			try {
				http = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (ex) {
				try {
					http = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (ex2) {
					http = false;
				}
			}
		} else if (window.XMLHttpRequest) {
			// If ActiveX is not available, use the XMLHttpRequest of Firefox/Mozilla etc. to load the document.
			try {
				http = new XMLHttpRequest();
			} catch (ex) {
				http = false;
			}
		}
		return http;
	},

	// Init function
	init : function() {
		return this.getHTTPObject();
	},

	// This function is called from the user's script. Arguments:
	// url - The url to be called. Append all the arguments like this 'get_data.php?id=5&car=benz' and make sure they are escaped.
	// callback - Function that must be called once the data is ready.
	// format - The return type. Could be 'xml', 'json' or 'text' (default). If it is json, the string will be 'eval'ed before returning it.
	// error - Function that must be called in case of error.
	load : function (url, callback, format, error) {
		//The XMLHttpRequest object is recreated at every call - to defeat Cache problem in IE.
		var http = this.init();

		if ((!http) || (!url)) {
			return;
		}

		// Set default return type to 'text' if missing.
		if (typeof format == 'undefined') {
			format = "text";
		}
		format = format.toLowerCase();

		// Kill the Cache problem in IE.
		url += (url.indexOf("?") > 0 ? "&" : "?") + "random=" + new Date().getTime();

		http.open("GET", url, true);

		// Call a function when the state changes - this is the inline function.
		http.onreadystatechange = function () {
			// Ready State will be 4 when the document is loaded.
			if (http.readyState == 4) {
				if (http.status == 200) {
					var result = "";
					if (typeof http.responseText != 'undefined') {
						result = http.responseText;
					}

					// If the return is in JSON format, eval the result before returning it.
					if (format == "json" && result != "") {
						// \n's in JSON string, when evaluated will create errors in IE.
						result = result.replace(/[\n\r]/g,"");
						result = eval('('+result+')');
					}

					// Give the data to the callback function.
					if (typeof callback != 'undefined') {
						callback.call(null, result);
					}
				} else {
					// Call error function.
					if (typeof error != 'undefined') {
						error.call(null, http.status, http.statusText);
					} else {
						alert("Error processing request [" + url + "]! Response is " + http.status + " - " + http.statusText);
					}
				}
			}
		};

		// Send request.
		http.send(null);
	}
};
