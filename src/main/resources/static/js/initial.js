$(document).ready(function() {
	disliked.style.display = 'none';
	liked.style.display = 'none';
	end.style.display = 'none';
	startOver.style.display = 'none';
});
var end = document.querySelector('.end');
var logo = document.querySelector('.logo');
var start = document.querySelector('.start');

var startOver = document.querySelector('.startOver')

startOver.onclick = function() {
	$.ajax({
		url : 'http://localhost:8080/dishes/restart',
		method : 'GET'
	}).done(
			function(dish) {
				$('#dishImage').html('<img src="' + dish.image + '">');
				$('.disliked').attr('data-dishid', dish.id);
				$('.liked').attr('data-dishid', dish.id);
				$('.getMapInfo').attr('data-longitude',
						dish.restaurant.longitude)
				$('.getMapInfo')
						.attr('data-latitude', dish.restaurant.latitude)
				$('#name').html(dish.name)
				$('#description').html(dish.description)
				$('#price').html(dish.price)
				$('#restaurantName').html(
						'<a href="' + dish.restaurant.website
								+ '" target="_blank">' + dish.restaurant.name
								+ '</a>')
				$('#address').html(dish.restaurant.address)
				$('#phoneNumber').html(
						'<a href="tel:' + dish.restaurant.phoneNumber + '">'
								+ dish.restaurant.phoneNumber + '</a>');
				$('#hours').html('Hours: ' + dish.restaurant.hours)
				$('#website').html(
						'<a href="' + dish.restaurant.website
								+ '" target="_blank">'
								+ dish.restaurant.website + '</a>');
				$('#delivery').html('Delivery? ' + dish.restaurant.delivery)
				dishImage.style.display = 'block';
				start.style.display = 'none';
				disliked.style.display = 'inline';
				liked.style.display = 'inline';
				logo.style.display = 'none';
				info.style.display = 'none';
				end.style.display = 'none';
				startOver.style.display = 'none';
			}).done(myMap);

};

start.onclick = function() {
	$.ajax({
		url : 'http://localhost:8080/dishes/next',
		method : 'GET'
	}).done(
			function(dish) {
				$('#dishImage').html('<img src="' + dish.image + '">');
				$('.disliked').attr('data-dishid', dish.id);
				$('.liked').attr('data-dishid', dish.id);
				$('.getMapInfo').attr('data-longitude',
						dish.restaurant.longitude)
				$('.getMapInfo')
						.attr('data-latitude', dish.restaurant.latitude)
				$('#name').html(dish.name)
				$('#description').html(dish.description)
				$('#price').html(dish.price)
				$('#restaurantName').html(
						'<a href="' + dish.restaurant.website
								+ '" target="_blank">' + dish.restaurant.name
								+ '</a>')
				$('#address').html(dish.restaurant.address)
				$('#phoneNumber').html(
						'<a href="tel:' + dish.restaurant.phoneNumber + '">'
								+ dish.restaurant.phoneNumber + '</a>');
				$('#hours').html('Hours: ' + dish.restaurant.hours)
				$('#website').html(
						'<a href="' + dish.restaurant.website
								+ '" target="_blank">'
								+ dish.restaurant.website + '</a>');
				$('#delivery').html('Delivery? ' + dish.restaurant.delivery)
				start.style.display = 'none';
				disliked.style.display = 'inline';
				liked.style.display = 'inline';
				logo.style.display = 'none';
			}).done(myMap);
};