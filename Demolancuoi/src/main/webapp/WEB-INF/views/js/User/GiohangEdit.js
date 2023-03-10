$(".editgh").on("click", function(){
	var id = $(this).data("id");
	var tongsl = $("#tongsl-"+id).val();
	window.location = "EditGiohang/"+id+"/"+tongsl;
});	