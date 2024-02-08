<%@page import="java.util.List" %>
<%@page import="edu.toshokoteca.pojo.Historieta" %>

<!--Formulario SUBIR HISTORIETA-->
<div class="formulario p-2 py-5 text-info bg-dark" id="subirhistorieta">
    <!--  JSP -->
    <form class="container-lg" method="post" action="<%=request.getContextPath()%>/CrearHistorietaController">
        <h2>Subir Historieta</h2>
        <div class="form-floating my-3">
            <input name="nombre" type="text" class="form-control" id="floatingNombre" placeholder="V de Vendetta">
            <label for="floatingNombre" class="text-secondary">Nombre de la historieta</label>
        </div>
        <div class="form-floating mb-3">
            <input name="guionista" type="text" class="form-control" id="floatingGuionista" placeholder="Alan Moore">
            <label for="floatingGuionista" class="text-secondary">Guionista</label>
        </div>
        <div class="form-floating mb-3">
            <input name="artista" type="text" class="form-control" id="floatingArtista" placeholder="Alan Moore">
            <label for="floatingArtista" class="text-secondary">Artista</label>
        </div>
        <div class="form-floating mb-3">
            <input name="editorial" type="text" class="form-control" id="floatingEditorial" placeholder="Alan Moore">
            <label for="floatingEditorial" class="text-secondary">Editorial</label>
        </div>
        <div class="form-floating mb-3">
            <input name="paginas" type="text" class="form-control" id="floatingPaginas" placeholder="Alan Moore">
            <label for="floatingPaginas" class="text-secondary">Paginas</label>
        </div>
        <div class="form-floating mb-3">
            <input name="fecha" type="text" class="form-control" id="floatingAño" placeholder="Alan Moore">
            <label for="floatingAño" class="text-secondary">Año</label>
        </div>
        <div class="form-floating mb-3">
            <input name="region" type="text" class="form-control" id="floatingRegion" placeholder="Alan Moore">
            <label for="floatingRegion" class="text-secondary">Region</label>
        </div>
        <button class="btn btn-primary">Subir Historieta</button>
        <!--<button type="submit" class="btn btn-primary">Subir Historieta</button>-->
    </form>
</div>