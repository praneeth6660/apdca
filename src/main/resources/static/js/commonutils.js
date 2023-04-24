function getMandals(a, b) {
	var userDate = {}
	userDate["circd"] = a;
	var dropdownSelect = ' <option value=""> --Select--- </option>';
	$.ajax({
		type : "POST",
		contentType : "application/json",
		dataType : 'json',
		data : JSON.stringify(userDate),
		url : "./getMandals",
		cache : false,
		success : function(data) {
			jQuery.each(data, function(index, item) {
				dropdownSelect += "<option value='" + item.areacd + "'> "
						+ item.area_name + "";
			});
			document.getElementById(b).innerHTML = dropdownSelect
		},
		error : function(e) {
		}
	});

}

function getJurisdiction(a, b, c) {
	var cirCd = document.getElementById(a).value;
	var areaCd = document.getElementById(b).value;
	var userDate = {}
	userDate["circd"] = cirCd;
	userDate["areacd"] = areaCd;
	var dropdownSelect = ' <option value=""> --Select--- </option>';
	$.ajax({
		type : "POST",
		contentType : "application/json",
		dataType : 'json',
		data : JSON.stringify(userDate),
		url : "./getJurisdiction",
		cache : false,
		success : function(data) {
			jQuery.each(data, function(index, item) {
				dropdownSelect += "<option value='" + item.jurcd + "'> "
						+ item.jur_name + "";
			});
			document.getElementById(c).innerHTML = dropdownSelect
		},
		error : function(e) {
		}
	});
}
