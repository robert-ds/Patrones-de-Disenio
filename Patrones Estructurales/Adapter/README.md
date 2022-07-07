# Patrón Adapter

El patrón de diseño Adapter es utilizado cuando tenemos interfaces de software incompatibles, las cuales a pesar de su incompatibilidad tiene una funcionalidad similar. Este patrón es implementado cuando se desea homogeneizar la forma de trabajar con estas interfaces incompatibles, para lo cual se crea una clase intermedia que funciona como un adaptador. Esta clase adaptador proporcionará los métodos para interactuar con la interface incompatible.

Este patrón es muy similar a los adaptadores de corriente o de video que convierten una entrada en otra como por ejemplo de Micro-HDMI a HDMI o Jack M de 3.5mm (Audio) a USB. En el caso del software el concepto es igual, creamos clases que convierten una entrada o salida a otra para poder interactuar con una clase.
