select e.name from employee e
join (
    select managerId from employee
    where managerId is Not null 
    group by managerId 
    having count(*) > 4
) mgr
on e.id = mgr.managerId;