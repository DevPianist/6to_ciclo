function validarTexto() {
    let text = 'Osáar';
    let patronLetras = /^[a-zA-ZñÑáéíóúÁÉÍÓÚ]*$/;
    if (patronLetras.test(text)) {
        console.log('SOLO HAY LETRAS');
    } else {
        console.log('RARO');
    }
}