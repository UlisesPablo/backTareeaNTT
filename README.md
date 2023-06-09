# backTareeaNTT
creacion de una API con H2 y gradle

Para este proyecto se han utilizadas las tecnologias solicitadas.
El endpoint de prueba es: http://localhost:8080/apiUsuarios
Para el json de entrada y poder crear a traves del metodo POST, debe ser el siguiente :

 {
        "name": "Juan Rodriguez",
        "emeal": "juan@gmail.com",
        "password": "hunter2",
        "phones":
            [
             "number: 1234567",
             "citycode: 1",
             "contrycode: 57"
            ]
    }



 Para listar todos use el metodo get con el mismo endpoint.
 Tambien puedes buscar por id, para eso añades /id que quiera encontrar, usese el mismo endpoint pero con metodo delete para eliminar.
