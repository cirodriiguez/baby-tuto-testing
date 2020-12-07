Feature: Filtrar producto
  Yo como cliente
  Quiero filtar los productos
  Para encontrar el producto que deseo

  Scenario: Filtrar producto por accesorio coches
    Given quiero econtrar accesorios para coches
    When  filtro por la marca BBPRO
    Then  deberia ver accesorios pertenecientes a la marca BBRPO