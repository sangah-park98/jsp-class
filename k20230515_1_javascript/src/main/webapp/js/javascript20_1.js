function requestID() {
	
	let parentID = opener.document.getElementById('parentID').value;
	console.log(parentID);
	
	document.getElementById('childID').value = parentID;
	
}