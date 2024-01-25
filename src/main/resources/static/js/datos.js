//----Datos de inicio-----

//variables Globales
var checkAreaCollapseOpen = "";
var checkAreaCollapseClose = "";

var map = L.map('map').setView([24.25, -90.17], 5);
L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
	maxZoom: 19,
	attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
}).addTo(map);

map.zoomControl.setPosition('topright');

$(".leaflet-control-container").append("<div class='mydiv'></div>");





$('#collapseSubMenu').on('show.bs.collapse', function() {

	let switchControl = event.srcElement.id;
	if (switchControl == "collapseSubMenu") {
		switchControl = checkAreaCollapseOpen;
	}

	switch (switchControl) {
		case ("herramientas"):
			console.log("Entro a hereamientas");
			$("#collapseSubMenu").append(
				"<div class='col-2 text-center' data-bs-toggle='collapse' href='#collapseSubMenuMarcas' role='button'" +
				"aria-expanded='false' aria-controls='collapseSubMenuMarcas'><button type='button' class='btn btn-secondary btn-sm col-12 rounded-0'>Marcas</button></div>");
			checkAreaCollapseOpen = switchControl;
			break;
		case ("misiones"):
			$("#collapseSubMenu").append(
				"<div class='col-2 text-center' data-bs-toggle='collapse' href='#collapseSubMenuActivas' role='button'" +
				"aria-expanded='false' aria-controls='collapseSubMenuActivas'><button type='button' class='btn btn-secondary btn-sm col-12 rounded-0'>Activas</button></div>" +
				"<div class='col-2 text-center' data-bs-toggle='collapse' href='#collapseSubMenuInactivas' role='button'" +
				"aria-expanded='false' aria-controls='collapseSubMenuInactivas'><button type='button' class='btn btn-secondary btn-sm col-12 rounded-0'>Inactivas</button></div>"
			);
			checkAreaCollapseOpen = switchControl;
			break;
		case ("derivadores"):
			$("#collapseSubMenu").append(
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'> Seatrec 1</label>" +
				"</div>" +
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'> Seatrec 2</label>" +
				"</div>"
			);
			checkAreaCollapseOpen = switchControl;
			break;
		case ("productos"):
			$("#collapseSubMenu").append(
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'>Frentes Térmicos Superficiales (GMOG-FTS)</label>" +
				"</div>" +
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'>Corriente Lagrangeana Superficial (GMOG-CLS)</label>" +
				"</div>" +
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'>Anomalías de Contenido de Sal y Calor (GMOG-ACSC)</label>" +
				"</div>" +
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'>Detección de Eddy</label>" +
				"</div>"

			);
			checkAreaCollapseOpen = switchControl;
			break;
		case ("satelite"):
			$("#collapseSubMenu").append(
				"<div class='col-12 text-center'>" +
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'>Corriente</label>" +
				"</div>" +
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'>ADT</label>" +
				"</div>" +
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'>CHL</label>" +
				"</div>" +
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'>SST</label>" +
				"</div>" +
				"</div>" +
				"<div class='col-12 text-center py-2'>" +
				"<div class='form-check form-switch form-check-inline justify-content-center'>" +
				"<b class='pr-2'>Escala:</b><span>Min:</span><input  class='w-25 h-25'  type='number'><span class='pl-2'>Max:</span><input  class='w-25 h-25'  type='number'>" +
				"</div>" +
				"</div>"
			);
			checkAreaCollapseOpen = switchControl;
			break;
		case ("batimetria"):
			$("#collapseSubMenu").append(
				"<div class='col-12 text-center'>" +
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'>-100(m)</label>" +
				"</div>" +
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'>-500(m)</label>" +
				"</div>" +
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'>-1000(m)</label>" +
				"</div>" +
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'>-2000(m)</label>" +
				"</div>" +
				"<div class='form-check form-switch form-check-inline'>" +
				"<input class='form-check-input' type='checkbox' id='flexSwitchCheckDefault'>" +
				"<label class='form-check-label' for='flexSwitchCheckDefault'>-3000(m)</label>" +
				"</div>" +
				"</div>" 
			);
			break;
	}
});
$('#collapseSubMenu').on('hide.bs.collapse', function() {

	checkAreaCollapseClose = event.srcElement.id;
	$('#collapseSubMenuActivas').collapse("hide");
	$('#collapseSubMenuInactivas').collapse("hide");
	$('#collapseSubMenuMarcas').collapse("hide");
	$('#collapseSubMenu').empty();


});

$('#collapseSubMenu').on('hidden.bs.collapse', function() {
	if (checkAreaCollapseClose != checkAreaCollapseOpen) {
		checkAreaCollapseOpen = checkAreaCollapseClose;
		$('#collapseSubMenu').collapse('show');
	}
});

$('#collapseSubMenuSub').on('show.bs.collapse', function() {

	console.log("1");

});