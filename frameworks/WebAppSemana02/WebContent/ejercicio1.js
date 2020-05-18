function btnLimpiar() {
    $("#num01").val("");
    $("#num02").val("");
    $("#divinfo").hide();
    $("#divresultado").html("");
}

function btnSumar() {
    let n1 = parseInt($("#num01").val());
    let n2 = parseInt($("#num02").val());
    let result = n1 + n2;
    $("#divresultado").html(result);
}