<%@ page contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib
prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Liste des clients</title>
    <link
      rel="stylesheet"
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
      crossorigin="anonymous"
    />
    <link
      rel="stylesheet"
      type="text/css"
      href="//netdna.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css"
    />
  </head>
  <body>
    <div class="container-fluid">
      <header
        class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom"
      >
        <a
          href="/"
          class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none"
        >
          <svg class="bi me-2" width="40" height="32">
            <use xlink:href="#bootstrap" />
          </svg>
          <span class="fs-4">BANKER</span>
        </a>

        <ul class="nav nav-pills">
          <li class="nav-item">
            <a href="/clients/liste" class="nav-link active" aria-current="page"
              >Clients</a
            >
          </li>
          <li class="nav-item"><a href="#" class="nav-link">Features</a></li>
          <li class="nav-item"><a href="#" class="nav-link">Pricing</a></li>
          <li class="nav-item"><a href="#" class="nav-link">FAQs</a></li>
          <li class="nav-item"><a href="#" class="nav-link">About</a></li>
        </ul>
      </header>
    </div>

    <h2 class="text-center">
      Liste des clients de la banque
      <a href="/clients/create"
        ><div class="btn btn-primary ms-5">Ajouter</div></a
      >
    </h2>
    <div class="my-5"></div>

    <div class="container">
      <table class="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Numéro</th>
            <th scope="col">Nom</th>
            <th scope="col">Prenom</th>
            <th scope="col">Adresse</th>
            <th scope="col">Actions</th>
          </tr>
        </thead>
        <tbody class="table-group-divider">
          <c:forEach var="client" items="${clients}" varStatus="loop">
            <tr>
              <th scope="row">${loop.index + 1}</th>
              <td>${client.numero}</td>
              <td>${client.nom}</td>
              <td>${client.prenom}</td>
              <td>${client.adresse}</td>
              <td style="width: 20%">
                <a href="${client.id}" class="table-link text-warning">
                  <span class="fa-stack">
                    <i class="fa fa-square fa-stack-2x"></i>
                    <i class="fa fa-search-plus fa-stack-1x fa-inverse"></i>
                  </span>
                </a>
                <a href="#" class="table-link text-info">
                  <span class="fa-stack">
                    <i class="fa fa-square fa-stack-2x"></i>
                    <i class="fa fa-pencil fa-stack-1x fa-inverse"></i>
                  </span>
                </a>
                <a href="#" class="table-link danger">
                  <span class="fa-stack">
                    <i class="fa fa-square fa-stack-2x"></i>
                    <i class="fa fa-trash-o fa-stack-1x fa-inverse"></i>
                  </span>
                </a>
              </td></tr
          ></c:forEach>
        </tbody>
      </table>

      <hr />
    </div>

    <!-- Autres éléments HTML ou intégration avec le modèle de données de votre application -->
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
      integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
