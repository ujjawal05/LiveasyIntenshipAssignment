CREATE TABLE load
(
loadId AUTOINCREMENT PRIMARY KEY,
 loadingPoint varchar(100) NOT NULL,
 unloadingPoint varchar(100) NOT NULL,
 productType varchar(100) NOT NULL,
 truckType varchar(100) NOT NULL,
 noOfTrucks varchar(100) NOT NULL,
 weight varchar(100) NOT NULL,
 comment varchar(100) NOT NULL,
 shipperId varchar(11) NOT NULL ,
 Date varchar(100) NOT NULL
);