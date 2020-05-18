function validarTexto() {
    let text = 'Oscar@';
    let patronNumeros = /\d/;
    let patronLetras = /\w/;
    let error = false;
    if (patronNumeros.test(text)) {
        error = true;
        console.log('HAY NUMEROS!!! O SIGNOS ESPECIALES XD');
    } else if (patronLetras.test(text)) {
        console.log('SOLO HAY LETRAS');
    } else {
        console.log('RARO');
    }
}