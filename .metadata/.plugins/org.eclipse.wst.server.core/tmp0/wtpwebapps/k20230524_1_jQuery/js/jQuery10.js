$(() => {
	
//	$('p:eq(0)').css('backgroudColor','pink');
//	$('span').eq(1).css('color', 'orange');

//	0번째 <p> 태그를 선택한 후 <span> 태그를 선택한다.
//	$('p > span').css('color', 'darkgray');
//	$('p:eq(0) > span').css('backgroundColor', 'darkgray');
//	$('p:eq(0) > span').css('color', 'white');
	
	$('p').eq(0).css('backgroundColor', 'blue');
	$('p').eq(0).add('span:eq(0)').css('color', 'white');
	
	$('div').children().css('color', 'pink');
	
	$('div').children().click(() => {
		
		if ($(this).is('span')) {
			$(this).css('color', 'red');
		}
		if ($(this).is('b')) {
			$(this).css('color', 'blue');
		}
		if ($(this).is('p')) {
			$(this).css('color', 'lime');
		}
	});

});