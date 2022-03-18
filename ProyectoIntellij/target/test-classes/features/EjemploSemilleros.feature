# language: es

Característica: Realizar compra de articulo
  como un nuevo cliente
  quiero ingresar a la pagina www.abc.com
  para realizar la compra de un articulo

  @EscenarioSinValor
  Escenario: agregar articulo al carrito de compra
    Dado que un cliente accede a la web de compras
    Cuando el agrego unos tapabocas KN95 al carrito
    Entonces el valida la compra

  @EscenarioSinValor
  Esquema del escenario: agregar producto al carrito de compras por medio de una lista
    Dado que un cliente accede a la web de compras
    Cuando el agrega producto al carrito por medio de una lista
      |<nombreProducto>|
    Entonces el valida la compra

    Ejemplos:
      |nombreProducto|
      |tapabocas KN95  |