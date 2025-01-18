Proyecto: TICKETBEAT

Este proyecto implementa un sistema para gestionar eventos, tickets y pagos, utilizando patrones de diseño que aseguran la escalabilidad, modularidad y mantenibilidad del sistema.

Patrones de Diseño Aplicados:

1. Factory Method

Implementación en el proyecto:
- Clases como `TicketFactory`, `VIPFactory`, `GeneralFactory`, y `ReservadoFactory` gestionan la creación de distintos tipos de tickets (`TicketVIP`, `TicketGeneral`, `TicketReservado`).
- Cada fábrica encapsula la lógica necesaria para crear su tipo de ticket correspondiente.

Justificación:
- Extensibilidad: Permite agregar nuevos tipos de tickets sin modificar el código existente, siguiendo el Principio Abierto/Cerrado (OCP).
- Consistencia: Garantiza que los objetos creados cumplan con las especificaciones necesarias para cada tipo de ticket.

2. Strategy

Implementación en el proyecto:
- La interfaz `MedioPago` define la operación `realizarPago()`, mientras que las clases concretas (`MedioTarjeta`, `MedioTransferencia`, `MedioMovil`) implementan diferentes estrategias para realizar pagos.
- La clase `Cobro` utiliza una instancia de `MedioPago` para delegar la lógica del proceso de pago, permitiendo cambiar el método de pago de manera dinámica.
  
Justificación:
- Flexibilidad: Permite que los clientes seleccionen o cambien el método de pago según sus necesidades, sin modificar la lógica principal de la clase `Cobro`.
- Reutilización: Las estrategias de pago son independientes y pueden reutilizarse en diferentes contextos del sistema.

3. Observer

Implementación en el proyecto:
- Clases como `Notificador`, `CanalCorreo`, `CanalSMS`, y `CanalMovil` implementan el patrón Observer para gestionar las notificaciones.
- Cuando ocurre un cambio significativo (por ejemplo, la confirmación de un ticket), los observadores son notificados para realizar las acciones necesarias, como enviar correos o SMS.
  
Justificación:
- Desacoplamiento: Separa la lógica de negocio del sistema de la lógica de notificación, facilitando el mantenimiento.
- Escalabilidad: Permite agregar nuevos canales de notificación sin alterar la funcionalidad del sistema principal.
