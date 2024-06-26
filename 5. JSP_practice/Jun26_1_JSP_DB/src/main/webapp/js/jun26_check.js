function appleRegCheck() {
	let lBox = document.appleRegForm.a_location;
	let pBox = document.appleRegForm.a_price;
	let iBox = document.appleRegForm.a_introduce;
	
	if (isEmpty(lBox)) {
		alert("Please Fill in Location Properly.")
		lBox.focus();
		return false;
	} else if (isEmpty(pBox) || isNotNumber(pBox)) {
		alert("Please Fill in Price Properly.")
		pBox.value = "";
		pBox.focus();
		return false;
	} else if (isEmpty(iBox) || atLeastLetter(ibox, 5)) {
		alert("Please Fill in Introduce Properly.")
		iBox.value = "";
		iBox.focus();
		return false;
	}
	return true;
}