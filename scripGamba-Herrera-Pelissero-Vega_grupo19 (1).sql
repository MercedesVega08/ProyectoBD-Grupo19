
use grupo19;
/** 
alter table grupo19.empresa  
add constraint luz check (cap_instalada >= 0 and cap_instalada < 50000);

alter table grupo19.persona  
add constraint dnipeos check (dni > 0 and dni < 1000000000);

create table grupo19.auditoria(
    nro_reclamo int not null,
    fecha date,
    id_usuario int not null,
    constraint pk_auditoria primary key (nro_reclamo, id_usuario),
    constraint fk_auditoria_nro_reclamo foreign key (nro_reclamo) references reclamo(nro_reclamo),
    constraint fk_auditoria_usuario foreign key (id_usuario) references usuario(id_usuario)
);

alter table grupo19.deriva drop foreign key fk_deriva_reclamo;

alter table grupo19.deriva add constraint fk_deriva_reclamo2 foreign key (nro_reclamo) references reclamo(nro_reclamo) on delete cascade;

alter table grupo19.llamada drop foreign key fk_llamada_reclamo;

alter table grupo19.llamada add constraint fk_llamada_reclamo2 foreign key (nro_reclamo) references reclamo(nro_reclamo) on delete cascade;

alter table grupo19.uso drop foreign key fk_uso_reclamo;

alter table grupo19.uso add constraint fk_uso_reclamo2 foreign key (nro_reclamo) references reclamo(nro_reclamo) on delete cascade;
*/
delimiter $$
create trigger grupo19.enviar_auditoria2
after delete on grupo19.reclamo
for each row 
begin
    insert into grupo19.auditoria (nro_reclamo, fecha, id_usuario) values (old.nro_reclamo, now(), old.id_usuario);
end$$
delimiter ;

