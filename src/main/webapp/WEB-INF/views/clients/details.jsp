<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Détails du client</title>
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

    <h2 class="text-center">Informations sur un client de la banque</h2>
    <div class="my-5"></div>

    <c:if test="${client.isPresent()}">
      <div class="container">
        <h2>Détails du client</h2>

        <div class="card">
          <div class="card-body">
            <h5 class="card-title">Informations personnelles</h5>
            <p class="card-text">
              <strong>Numéro :</strong> ${client.get().numero}
            </p>
            <p class="card-text"><strong>Nom :</strong> ${client.get().nom}</p>
            <p class="card-text">
              <strong>Prénom :</strong> ${client.get().prenom}
            </p>
            <p class="card-text">
              <strong>Adresse :</strong> ${client.get().adresse}
            </p>
            <p class="card-text">
              <strong>Nom du conseiller :</strong> ${client.get().nomconseiller}
            </p>
            <p class="card-text">
              <strong>Employé :</strong> ${client.get().employe.nom}
              ${client.get().employe.prenom}
            </p>
            <p class="card-text">
              <strong>Agence :</strong> ${client.get().agence.nom}
            </p>
          </div>
        </div>
      </div>
    </c:if>

    <c:if test="${!client.isPresent()}"> Le client n'existe pas. </c:if>

    <!-- Autres éléments HTML ou intégration avec le modèle de données de votre application -->
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
      integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
