//----Datos de inicio-----

//variables Globales
var checkAreaSubMenuIdOpen = "";
var checkAreaSubMenuIdClose = "";

var map = L.map('map').setView([24.25, -90.17], 5);
L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
	maxZoom: 19,
	attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
}).addTo(map);

map.zoomControl.setPosition('topright');

$(".leaflet-control-container").append("<div class='mydiv'></div>");





$('#collapseSubMenu').on('show.bs.collapse', function() {
	
	let switchControl = event.srcElement.id;
	if(switchControl == "collapseSubMenu"){
		switchControl = checkAreaSubMenuIdOpen;
	}
	
	switch (switchControl) {
		case ("herramientas"):
			console.log("Entro a hereamientas");
			$("#collapseSubMenu").append(
				"<div class='col-2 text-center'><button type='button' class='btn btn-secondary btn-sm col-12 rounded-0'>Marcas</button></div>");
			checkAreaSubMenuIdOpen = switchControl;
			break;
		case ("misiones"):
			$("#collapseSubMenu").append(
					"<div class='col-2 text-center' data-bs-toggle='collapse' href='#collapseSubMenuActivas' role='button'"+
				"aria-expanded='false' aria-controls='collapseSubMenuActivas'><button type='button' class='btn btn-secondary btn-sm col-12 rounded-0'>Activas</button></div>" +
					"<div class='col-2 text-center' data-bs-toggle='collapse' href='#collapseSubMenuInactivas' role='button'"+
				"aria-expanded='false' aria-controls='collapseSubMenuInactivas'><button type='button' class='btn btn-secondary btn-sm col-12 rounded-0'>Inactivas</button></div>"
			);
			checkAreaSubMenuIdOpen = switchControl;
			break;
		

	}

});
$('#collapseSubMenu').on('hide.bs.collapse', function() {
	
	checkAreaSubMenuIdClose =  event.srcElement.id;
	$('#collapseSubMenu').empty();
	
});

$('#collapseSubMenu').on('hidden.bs.collapse', function() {
	if (checkAreaSubMenuIdClose != checkAreaSubMenuIdOpen) {
		checkAreaSubMenuIdOpen = checkAreaSubMenuIdClose;
		$('#collapseSubMenu').collapse('show');
	}
});

$('#collapseSubMenuSub').on('show.bs.collapse', function() {

	console.log("1");
	
});