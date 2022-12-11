package service;

import exception.DepartmentException;
import model.Department;
import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import org.apache.commons.lang3.StringUtils;
import repository.DepartmentRepositoryJdbc;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {



    private final DepartmentRepositoryJdbc departmentRepository;

    public DepartmentService() {
        departmentRepository = new DepartmentRepositoryJdbc();

    }

            public ArrayList<Department> getAll() {

                return (ArrayList<Department>) departmentRepository.getAll();
            }

            public Department getById(int id) {
                return departmentRepository.getById(id);
            }


            public int create(Department department) {

                return departmentRepository.create(department);
            }


            public void update(Department department) {
               departmentRepository.update(department);
            }

            public void delete(int id) {
                Department department = getById(id);
                if (department == null) {

                    throw new DepartmentException("cannot find department with id " + id);
                }

                departmentRepository.delete(id);
            }



            }




