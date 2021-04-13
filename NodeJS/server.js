var express = require("express");
const bodyParser = require("body-parser");
var app = express();
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

app.listen(5000, () => {
 console.log("Servidor corriendo en puerto 5000");
});

app.get("/countries", (req, res, next) => {
 res.json(
    [
    {
      "id": 1,
      "name": "Chile"
    },
    {
      "id": 2,
      "name": "Argentina"
    },
    {
      "id": 3,
      "name": "Francia"
    },
    {
      "id": 4,
      "name": "Alemania"
    }
    ]
  );
});
