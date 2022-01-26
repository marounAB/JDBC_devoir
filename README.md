# JDBC_devoir

J'ai téléchargé le jar file du connector de MYSQL et j'ai créé une base de données nommée devoir dans laquelle il y a une seule table nommée Students dans laquelle il y a le nom et le prenom d'étudiants.

le code est dans Main.java<br/>
`String url = "jdbc:mysql://localhost:3306/devoir";`

Ici dans url j'ai les informations suivantes:<br/>
-C'est une base de données MYSQL<br/>
-Le nom de la base de données est devoir<br/>

Maintenant le code pour faire accé a la base de données est le suivant:<br/>
```
try {
	Connection cx = DriverManager.getConnection(url, "root", "12345");
	Statement statement = cx.createStatement();
	ResultSet result = statement.executeQuery("SELECT * FROM Students");
	while (result.next()) {
		System.out.println("firstname = " + result.getString("firstname") + " lastname = " + result.getString("lastname"));
	}
} catch (SQLException e) {
	e.printStackTrace();
}
```

-on crée une connection a la base de données avec l'utilisateur root qui a comme mot de passe 12345.<br/>
-on crée un Statement qu'on va utilisé pour éxécuter une requête SQL.<br/>
-le resultat de cette requête est mis dans un ResultSet.<br/>
-à la fin on parcours le ResultSet pour afficher le resultat.<br/>

Et en fin voici la sortie du code:

![](https://drive.google.com/uc?export=view&id=1qBNubMUieZYQdnlRv86k5GUqk3gPziha)
