$(document).ready(function(){
	$("#submit_button").on('click',function(){
		var lat = $("#lat").val();
		var long = $("#long").val();
		$.ajax({
			url:`https://maps.googleapis.com/maps/api/geocode/json?latlng=${lat},${long}&key=AIzaSyDeEpzO0oR49Wlp0tRc3sUY3kywi_SLnPY`,
			type:'GET',
			success:function(response){
				if (response.status=="OK") {
					$("#address").html(response.results[0].formatted_address)
				}
			},
			error:function(err){
				console.log(err);
			}
		})
	})
})