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
    <style>
      body {
        margin: 0;
        padding-top: 40px;
        color: #2e323c;
        background: #f5f6fa;
        position: relative;
        height: 100%;
      }
      .account-settings .user-profile {
        margin: 0 0 1rem 0;
        padding-bottom: 1rem;
        text-align: center;
      }
      .account-settings .user-profile .user-avatar {
        margin: 0 0 1rem 0;
      }
      .account-settings .user-profile .user-avatar img {
        width: 90px;
        height: 90px;
        -webkit-border-radius: 100px;
        -moz-border-radius: 100px;
        border-radius: 100px;
      }
      .account-settings .user-profile h5.user-name {
        margin: 0 0 0.5rem 0;
      }
      .account-settings .user-profile h6.user-email {
        margin: 0;
        font-size: 0.8rem;
        font-weight: 400;
        color: #9fa8b9;
      }
      .account-settings .about {
        margin: 2rem 0 0 0;
        text-align: center;
      }
      .account-settings .about h5 {
        margin: 0 0 15px 0;
        color: #007ae1;
      }
      .account-settings .about p {
        font-size: 0.825rem;
      }
      .form-control {
        border: 1px solid #cfd1d8;
        -webkit-border-radius: 2px;
        -moz-border-radius: 2px;
        border-radius: 2px;
        font-size: 0.825rem;
        background: #ffffff;
        color: #2e323c;
      }

      .card {
        background: #ffffff;
        -webkit-border-radius: 5px;
        -moz-border-radius: 5px;
        border-radius: 5px;
        border: 0;
        margin-bottom: 1rem;
      }
    </style>
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

    <h2 class="text-center">Ajouter un client</h2>
    <div class="my-5"></div>

    <div class="container">
      <div class="row gutters">
        <div class="col-xl-3 col-lg-3 col-md-12 col-sm-12 col-12">
          <div class="card h-100">
            <div class="card-body">
              <div class="account-settings">
                <div class="user-profile">
                  <div class="user-avatar">
                    <img
                      src="https://bootdey.com/img/Content/avatar/avatar7.png"
                      alt="Maxwell Admin"
                    />
                  </div>
                  <h5 class="user-name">Yuki Hayashi</h5>
                  <h6 class="user-email">yuki@Maxwell.com</h6>
                </div>
                <div class="about">
                  <h5>About</h5>
                  <p>
                    I'm Yuki. Full Stack Designer I enjoy creating user-centric,
                    delightful and human experiences.
                  </p>
                </div>
              </div>
            </div>
          </div>
        </div>
        <div class="col-xl-9 col-lg-9 col-md-12 col-sm-12 col-12">
          <div class="card h-100">
            <div class="card-body">
              <div class="row gutters">
                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                  <h6 class="mb-2 text-primary">Personal Details</h6>
                </div>
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                  <div class="form-group">
                    <label for="fullName">Full Name</label>
                    <input
                      type="text"
                      class="form-control"
                      id="fullName"
                      placeholder="Enter full name"
                    />
                  </div>
                </div>
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                  <div class="form-group">
                    <label for="eMail">Email</label>
                    <input
                      type="email"
                      class="form-control"
                      id="eMail"
                      placeholder="Enter email ID"
                    />
                  </div>
                </div>
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                  <div class="form-group">
                    <label for="phone">Phone</label>
                    <input
                      type="text"
                      class="form-control"
                      id="phone"
                      placeholder="Enter phone number"
                    />
                  </div>
                </div>
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                  <div class="form-group">
                    <label for="website">Website URL</label>
                    <input
                      type="url"
                      class="form-control"
                      id="website"
                      placeholder="Website url"
                    />
                  </div>
                </div>
              </div>
              <div class="row gutters">
                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                  <h6 class="mt-3 mb-2 text-primary">Address</h6>
                </div>
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                  <div class="form-group">
                    <label for="Street">Street</label>
                    <input
                      type="name"
                      class="form-control"
                      id="Street"
                      placeholder="Enter Street"
                    />
                  </div>
                </div>
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                  <div class="form-group">
                    <label for="ciTy">City</label>
                    <input
                      type="name"
                      class="form-control"
                      id="ciTy"
                      placeholder="Enter City"
                    />
                  </div>
                </div>
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                  <div class="form-group">
                    <label for="sTate">State</label>
                    <input
                      type="text"
                      class="form-control"
                      id="sTate"
                      placeholder="Enter State"
                    />
                  </div>
                </div>
                <div class="col-xl-6 col-lg-6 col-md-6 col-sm-6 col-12">
                  <div class="form-group">
                    <label for="zIp">Zip Code</label>
                    <input
                      type="text"
                      class="form-control"
                      id="zIp"
                      placeholder="Zip Code"
                    />
                  </div>
                </div>
              </div>
              <div class="row gutters">
                <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                  <div class="text-right">
                    <button
                      type="button"
                      id="submit"
                      name="submit"
                      class="btn btn-secondary"
                    >
                      Cancel
                    </button>
                    <button
                      type="button"
                      id="submit"
                      name="submit"
                      class="btn btn-primary"
                    >
                      Update
                    </button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <!-- Autres éléments HTML ou intégration avec le modèle de données de votre application -->
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js"
      integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
