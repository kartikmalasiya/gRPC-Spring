package com.techgeeknext.employee.service;

import com.techgeeknext.employee.entity.EmployeeEntity;
import com.techgeeknext.employee.repository.EmployeeRepository;
import com.techgeeknext.constants.Role;
import com.techgeeknext.employee.EmployeeRequest;
import com.techgeeknext.employee.EmployeeResponse;
import com.techgeeknext.employee.CreateEmployeeRequest;
import com.techgeeknext.employee.CreateEmployeeResponse;
import com.techgeeknext.employee.EmployeeServiceGrpc;
import com.techgeeknext.employee.CreateEmployeeServiceGrpc;
import com.techgeeknext.employee.repository.EmployeeRepository;
import io.grpc.stub.StreamObserver;
import lombok.*;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
@AllArgsConstructor
public class CreateEmployeeService  extends CreateEmployeeServiceGrpc.CreateEmployeeServiceImplBase {


    //private final EmployeeRepository employeeRepository;
    @Override
    public void createEmployee(CreateEmployeeRequest request, StreamObserver<CreateEmployeeResponse> responseObserver) {

        //EmployeeEntity employee=new EmployeeEntity();
        // Extract employee data from the request
        String empId = request.getEmpId();
        String name = request.getName();
        //employee.setName(name);
       // employee.setEmp_id(empId);
       // employeeRepository.save(employee);
        // Perform the necessary logic to create an employee in the database
        // For this example, we'll assume the employee is successfully created
        // You should replace this code with the actual logic to persist the employee in your database

        // Assuming the employee creation is successful, create the response object
        CreateEmployeeResponse empResp = CreateEmployeeResponse.newBuilder().setEmpId(empId).setName(name).build();

        // Send the response object back to the client
        responseObserver.onNext(empResp);

        // Mark the process as completed
        responseObserver.onCompleted();
    }

}
