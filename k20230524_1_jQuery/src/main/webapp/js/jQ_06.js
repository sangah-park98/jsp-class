$(() => {
	$('.error').hide();
	
	$('#single').submit(function () {
		let userID = $('#infoBox').val().trim();
		if(userID == null || userID == '') {
			$('#infoBox').val('');
			$('#infoBox').focus();
			$('.error').show();
			return false;
		}
		return true;
	});
	
	$('input:checkbox[name=all]').click(function () {
		let checked = $('input:checkbox[name=all]').prop('checked');
		$('input:checkbox[name:chk]').prop('checked', checked);
	});
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
});