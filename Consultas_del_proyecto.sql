/**------Ejercicio 6 b) ----------------*/

select id_usuario, count(nro_reclamo) as cant_reclamo
from grupo19.reclamo
group by id_usuario
having count(nro_reclamo) > 1;

/**----------- respuesta -----------*/

/**select * from grupo19.reclamo;
select * from grupo19.auditoria:*/