SELECT * FROM job_history jh
where (jh.job_id) = 'AC_MGR' and 
(exists(select jh2.employee_id from job_history jh2
where jh2.job_id = 'AC_ACCOUNT' and
jh.employee_id = jh2.employee_id
and jh2.end_date<jh.start_date));

