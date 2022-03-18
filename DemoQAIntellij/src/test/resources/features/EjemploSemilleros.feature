# language: es

Característica: Realizar acciones al momento
de ingresar a la pagina demoqa.com
como son Elements, Widgets y Alerts.

@EscenariosDemoQA
Escenario: : ingresar a Elements a la opcion Web Tables a adicionar y eliminar un usuario
Dado que queremos ingresar a demoqa
Cuando vamos a elements a la opcion web table a adicionar y a eliminar un usuario y se escriba los datos Pablo, Rojas, pablorojas@cbit-online.com, 18, 1000000, Calidad, Cierra, 09/21/2021, 12/24/2021 23:59, PabloRojas en la pagina
Entonces el ve su usuario creado

@EscenariosDemoQA
Esquema del escenario: ingresar a Elements a la opcion Web Tables a adicionar y eliminar un usuario por medio de una lista
Dado que queremos ingresar a demoqa
Cuando vamos a elements a la opcion web table a adicionar y a eliminar un usuario y se escriba los datos por medio de una lista
  |<firstName>|<lastName>|<email>|<age>|<salary>|<department>|<eliminado>|<selectDate>|<dateAndTime>|<name>|
Entonces el ve su usuario creado

    Ejemplos:
      |firstName|lastName|email|age|salary|department|eliminado|selectDate|dateAndTime|name|
      |Pablo    |Rojas   |pablorojas@cbit-online.com|18|1000000|Calidad|Cierra|09/21/2021|12/24/2021 23:59|PabloRojas|
      |Cesar    |Romero  |cesarromero@cbit-online.com|19|2000000|Automatizacion|Cierra|09/21/2022|12/24/2022 23:59|CesarRomero|