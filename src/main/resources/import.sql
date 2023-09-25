INSERT INTO ingredientes
(ingredient_name)
VALUES
    ('Tomate'),('Nata'),('Mozzarella'),('Orégano'),('Queso Philadelphia'),('Bacon'),
    ('Champiñon'),('Olivas'),('Salami'),('Salchichas'),('Pepperoni'),('Serrano'),
    ('Huevo'),('Pollo'),('Atún'),('Cebolla'),('Pimiento Rojo'),
    ('Lechuga'),('Croutons'),('Parmesano'),('Salsa Cesar'),
    ('Rúcula'),('Salsa Pesto'),('Salmón'),('Nueces'),('Queso de cabra'),
    ('Panceta'),('Ricotta'),('Espinacas'),('Mantequilla'),('Ajo'),('Guindilla'),
    ('piñones'),('Ternera'),('Bechamel'),('Berenjenas'),
    ('Bizcochos'),('Café'),('Mascarpone'),('Azucar'),('Cacao'),
    ('Leche'),('Frutos rojos'),('Chocolate'),('Pistachos'),('Marsala'),('Albahaca');

INSERT INTO categorias
(nombre_categoria)
VALUES
    ('Ensaladas'), ('Pizzas'), ('Pastas'),
    ('Gratinados'), ('Postres'), ('Bebidas');

INSERT INTO productos
(descripcion,
 imagen_producto,
 nombre_producto)
VALUES
    ('Deliciosa pizza casera elaborada con masa madre, cocida en horno de leña e ingredientes frescos. Con base de ','https://i.postimg.cc/dVVm8cLL/suprema.jpg','Suprema'),
    ('Deliciosa pizza casera elaborada con masa madre, cocida en horno de leña e ingredientes frescos. Con base de ','https://i.postimg.cc/5tG34K9j/pepperoni.jpg','Al Pepperoni'),
    ('Deliciosa pizza casera elaborada con masa madre, cocida en horno de leña e ingredientes frescos. Con base de ','https://i.postimg.cc/TPZVMyQD/superchachi.jpg','Superchachi'),
    ('Deliciosa pizza casera elaborada con masa madre, cocida en horno de leña e ingredientes frescos. Con base de ','https://i.postimg.cc/fWdHLs9s/iberica.jpg','Ibérica'),
    ('Deliciosa pizza casera elaborada con masa madre, cocida en horno de leña e ingredientes frescos. Con base de ','https://i.postimg.cc/Kc3WMLCd/angelo.jpg','Ángelo'),
    ('Deliciosa pizza casera elaborada con masa madre, cocida en horno de leña e ingredientes frescos. Con base de ','https://i.postimg.cc/VkgZ8Fbb/atun.jpg','Atún'),
    ('Una deliciosa mezcla de lechugas variadas frescas, crujientes croutons, tiernos trozos de pollo empanado, generosas láminas de queso parmesano y una cremosa salsa César.','https://i.postimg.cc/mkWyMcHs/cesar.jpg','Ensalada César con pollo crujiente'),
    ('Una ensalada fresca y vibrante que combina lechuga variada y rúcula con rodajas de mozzarella fresca y pollo a la parrilla. Coronada con virutas de parmesano y aderezada con una irresistible salsa pesto.','https://i.postimg.cc/Sxk13Pjh/caligola.jpg','Ensalada Caligola'),
    ('Disfruta de la sencillez con rodajas de tomate maduro, mozzarella de búfala de alta calidad y aceitunas negras que se combinan en armonía. Nuestro aliño italiano artesanal realza los sabores naturales de los ingredientes','https://i.postimg.cc/W4f9Db8N/caprese.jpg','Ensalada Caprese'),
    ('Una ensalada que combina una mezcla de lechugas variadas y rúcula con salmón a la parrilla, nueces crujientes y queso de cabra flambeado y la vinagreta de mostaza que aporta un toque de picante y dulzura','https://i.postimg.cc/mk47k0vZ/varese.jpg','Ensalada Varese'),
    ('Delicados espaguetis bañados en una cremosa y seductora salsa de huevo, panceta crujiente y queso parmesano. Un clásico romano que cautiva con su simplicidad y sabor inigualable.','https://i.postimg.cc/t4qD2VmR/carbonara.jpg','Spaghetti Carbonara'),
    ('Pequeños paquetes de pasta rellenos de ricotta cremosa y espinacas frescas, bañados en una sencilla salsa de mantequilla y salvia. Una delicia de la Toscana que destaca por su elegancia.','https://i.postimg.cc/Sx1Ld1MV/ravioli.jpg','Ravioli de Ricotta y Espinacas'),
    ('Cintas de fettuccine cocidas al dente y cubiertas con una lujosa salsa de nata, mantequilla y queso parmesano. Un plato indulgente que es un homenaje a la simplicidad y la exquisitez.','https://i.postimg.cc/pXN6YrHy/alfredo.jpg','Fettuccine Alfredo'),
    ('Tubos de penne bañados en una salsa picante de tomate, ajo y guindilla. Una explosión de sabor que despierta los sentidos y satisface el paladar amante del picante.','https://i.postimg.cc/bNQF6Pyg/arrabiata.jpg','Penne allArrabbiata'),
    ('Finas tiras de tagliatelle bañadas en una vibrante salsa pesto genovés, hecha con albahaca fresca, piñones, queso parmesano y aceite de oliva extra virgen. Una explosión de sabores frescos y herbales que evocan la costa de Liguria.','https://i.postimg.cc/TPyV4jjx/tagliatelle.jpg','Tagliatelle con Pesto Genovés'),
    ('Capas de pasta fresca intercaladas con una rica salsa de carne bolognesa, bechamel suave y queso derretido. Un plato reconfortante que es un abrazo directo desde la cocina italiana.','https://i.postimg.cc/TYXt5sVD/lasana.jpg','Lasagna Bolognese'),
    ('Tubos de pasta rellenos de una mezcla cremosa de ricotta y espinacas, cubiertos con una generosa capa de salsa de tomate y queso parmesano. Luego, se gratinan en el horno para obtener una deliciosa y dorada cobertura.','https://i.postimg.cc/YSSnqm1D/canelones.jpg','Cannelloni de Ricotta y Espinacas'),
    ('Similar a la lasaña, este plato presenta macarrones cocidos al dente en capas con una salsa de carne sazonada y bechamel. Se gratina en el horno para obtener una cobertura dorada y crujiente, creando un plato gratinado italiano lleno de sabor.','https://i.postimg.cc/GhJqFjKS/Maccheroni.jpg','Pasticcio di Maccheroni'),
    ('Rodajas de berenjena empanadas y fritas se alternan con capas de salsa de tomate y queso mozzarella en este gratinado italiano. Se hornea hasta que el queso esté derretido y burbujeante para disfrutar de los sabores tradicionales de Italia.','https://i.postimg.cc/j57hL6Cc/melanzane.jpg','Melanzane alla Parmigiana'),
    ('Este icónico postre italiano combina capas de bizcocho de soletilla empapado en café con una suave mezcla de mascarpone, huevos y azúcar. Se espolvorea con cacao en polvo antes de servirlo','https://i.postimg.cc/5N3SY29h/tiramisu.jpg','Tiramisú'),
    ('Nuestra Panna Cotta es un deleite italiano de textura suave y sedosa. Elaborada con crema de leche, azúcar y gelatina, esta creación se sirve en un delicado molde y se corona con una irresistible salsa de frutos rojos que realza su dulzura.','https://i.postimg.cc/QdfmPxRQ/pannacota.jpg','Panna Cotta'),
    ('Los Cannoli Sicilianos son pequeñas obras de arte dulces. Nuestros cannoli presentan una crujiente cáscara de masa frita rellena de una mezcla de ricotta fresca, azúcar glas y trozos de chocolate. Se espolvorean con azúcar glas y pistachos picados','https://i.postimg.cc/LXYxjKQz/cannoli.jpg','Cannoli Sicilianos'),
    ('Nuestro Zabaione es una experiencia culinaria italiana única. Preparado con yemas de huevo, azúcar y el toque distintivo del vino Marsala, esta crema espumosa se sirve en su punto perfecto de dulzura y se acompaña de frutas frescas de temporada.','https://i.postimg.cc/nzBvHHww/zabaione.jpg','Zabaione');

INSERT INTO producto_ingrediente
(producto_id,
 ingrediente_id)
VALUES
    (1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8),
    (2,1),(2,4),(2,3),(2,11),(2,8),
    (3,1),(3,3),(3,4),(3,6),(3,9),(3,10),(3,8),
    (4,1),(4,3),(4,4),(4,12),(4,6),(4,13),(4,8),
    (5,2),(5,3),(5,4),(5,14),(5,8),
    (6,1),(6,3),(6,4),(6,15),(6,16),(6,17),(6,8),
    (7,18),(7,19),(7,14),(7,20),(7,21),
	(8,18),(8,22),(8,3),(8,14),(8,20),(8,23),
	(9,1),(9,3),(9,8),
	(10,18),(10,22),(10,24),(10,25),(10,26),
	(11,13),(11,27),(11,20),
	(12,28),(12,29),(12,30),
	(13,2),(13,30),(13,20),
	(14,1),(14,31),(14,32),
	(15,47),(15,33),(15,20),
	(16,34),(16,1),(16,35),(16,20),
	(17,28),(17,29),(17,1),(17,20),
	(18,34),(18,1),(18,35),
	(19,36),(19,1),(19,3),
	(20,37),(20,38),(20,39),(20,40),(20,41),
	(21,42),(21,40),(21,43),
	(22,28),(22,40),(22,44),(22,45),
	(23,13),(23,40),(23,46);

INSERT INTO tamano
(tamano,pvp)
VALUES
    ('normal',6.50),('mediana',9.60),('familiar',16.50),
    ('normal',5.90),('mediana',8.90),('familiar',16.00),
    ('único', 8.90),('único',12.90),('único', 17.90),('único', 7.80);

INSERT INTO producto_tamano
(producto_id,
 tamano_id)
VALUES
    (1,1),(1,2),(1,3),
    (2,4),(2,5),(2,6),
    (3,4),(3,5),(3,6),
    (4,1),(4,2),(4,3),
    (5,4),(5,5),(5,6),
    (6,4),(6,5),(6,6),
    (7,7),(8,7),(9,7),(10,7),
    (11,8),(12,8),(13,8),(14,8),(15,8),
    (16,9),(17,9),(18,9),(19,9),
    (20,10),(21,10),(22,10),(23,10);

INSERT INTO producto_categoria
(productoid,
 categoriaid)
VALUES
    (1,2),(2,2),(3,2),(4,2),(5,2),(6,2),
    (7,1),(8,1),(9,1),(10,1),
    (11,3),(12,3),(13,3),(14,3),(15,3),
    (16,4),(17,4),(18,4),(19,4),
    (20,5),(21,5),(22,5),(23,5);