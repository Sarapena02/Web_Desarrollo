function quitarTildes(str) {
    return str.normalize('NFD').replace(/[\u0300-\u036f]/g, '');
}

document.addEventListener('DOMContentLoaded', function () {
    const searchInput = document.getElementById('search-input');
    const searchFilterSelect = document.getElementById('search-filter-select');
    const table = document.getElementById('mascotas-table');
    const rows = table.getElementsByTagName('tr');

    searchInput.addEventListener('input', function () {
        const searchText = quitarTildes(searchInput.value.toLowerCase().replace(/,/g, '')); // Elimina comas y tildes
        const filterType = searchFilterSelect.value; // Obtiene el valor seleccionado en el filtro

        // Variable para alternar el color de las filas
        let isEven = false;

        // Itera a través de las filas de la tabla (comenzando desde el índice 1 para omitir el encabezado)
        for (let i = 1; i < rows.length; i++) {
            const row = rows[i];
            const cellText = quitarTildes(row.cells[filterType === "nombre" ? 0 : 1].textContent.toLowerCase().replace(/,/g, '')); // Elimina comas y tildes

            if (cellText.includes(searchText)) {
                row.style.display = ''; // Muestra la fila si coincide con la búsqueda
                // Cambia el color de fondo de la fila según si es par o impar
                row.style.backgroundColor = isEven ? '#dfcae1' : '#e5dde6';
                isEven = !isEven; // Cambia la variable para la siguiente fila
            } else {
                row.style.display = 'none'; // Oculta la fila si no coincide con la búsqueda
            }
        }
    });
});
