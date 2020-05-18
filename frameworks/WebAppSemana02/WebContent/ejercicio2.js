function btnLimpiar() {
    $("#num01").val("");
    $("#num02").val("");
    $("#divinfo").hide();
    $("#divresultado").html("");
}

function btnSumar() {
    let n1 = parseFloat($("#num01").val());
    let n2 = parseFloat($("#num02").val());
    if (validate(n1, n2)) {
        let result = n1 + n2;
        $("#divresultado").html(result);
    }
}

function btnRestar() {
    let n1 = parseFloat($("#num01").val());
    let n2 = parseFloat($("#num02").val());
    if (validate(n1, n2)) {
        let result = n1 - n2;
        $("#divresultado").html(result);
    }
}

function btnDividir() {
    let n1 = parseFloat($("#num01").val());
    let n2 = parseFloat($("#num02").val());
    if (validate(n1, n2)) {
        let result = n1 / n2;
        $("#divresultado").html(result);
    }
}

function btnMultiplicar() {
    let n1 = parseFloat($("#num01").val());
    let n2 = parseFloat($("#num02").val());
    if (validate(n1, n2)) {
        let result = n1 * n2;
        $("#divresultado").html(result);
    }
}

function validate(n1, n2) {
    if ($.isNumeric(n1) && $.isNumeric(n2))
        return true;
    else {
        $("#divresultado").html('Ingrese solo numeros');
        return false;
    }
}