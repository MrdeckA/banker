<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Enregistrement d'un nouveau client</title>
</head>
<body>
    <h1>Enregistrement d'un nouveau client</h1>
    
    <form action="" method="post">
        <label for="nom">Nom :</label>
        <input type="text" id="nom" name="nom" required><br><br>
        
        <label for="email">Prenom</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="email">Adresse </label>
        <input type="email" id="email" name="email" required><br><br>

        
        <!-- Ajoutez d'autres champs pour plus d'informations -->
        
        <input type="submit" value="Enregistrer">
    </form>
</body>
</html>
