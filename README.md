# order-crochedot-app
Used Java to make an Android app using queues for managing order inventory and order processing

We developed an android application to manage orders at Crochedot. This application used queues. In this queue, other than the pointers we had all the info of order including items details and customer details. We used separate queues to input orders; new orders given, working orders, completed orders. We put a new order by using a form which formed a node of the queue. Once an order was started it moved to working orders and once its complete, it moved to completed orders. We wrote functions to calculate the total income generated and total orders completed
