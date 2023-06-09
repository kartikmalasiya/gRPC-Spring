package com.techgeeknext.employee.service;

import com.techgeeknext.employee.entity.EmployeeEntity;
import com.techgeeknext.employee.repository.EmployeeRepository;
import com.techgeeknext.constants.Role;
import com.techgeeknext.employee.EmployeeRequest;
import com.techgeeknext.employee.EmployeeResponse;
import com.techgeeknext.employee.CreateEmployeeRequest;
import com.techgeeknext.employee.CreateEmployeeResponse;

import com.techgeeknext.employee.EmployeeUpdateRequest;
import com.techgeeknext.employee.EmployeeUpdateResponse;
import com.techgeeknext.employee.EmployeeServiceGrpc;
import com.techgeeknext.employee.EmployeeUpdateServiceGrpc;
import com.techgeeknext.employee.CreateEmployeeServiceGrpc;
import com.techgeeknext.employee.repository.EmployeeRepository;
import io.grpc.stub.StreamObserver;
import lombok.*;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
@AllArgsConstructor
public class UpdateEmployeeService  extends EmployeeUpdateServiceGrpc.EmployeeUpdateServiceImplBase{

    @Override
    public void updateEmployee(EmployeeUpdateRequest request, StreamObserver<EmployeeUpdateResponse> responseObserver) {
        // Extract employee data from the request
        String empId = request.getEmpId();
        String newName = request.getNewName();

        // Perform the necessary logic to update the employee in the database
        // For this example, we'll assume the employee is successfully updated
        // You should replace this code with the actual logic to update the employee in your database

        // Assuming the employee update is successful, create the response object
        EmployeeUpdateResponse empResp = EmployeeUpdateResponse.newBuilder()
                .setEmpId(empId)
                .setName(newName)
                .build();

        // Send the response object back to the client
        responseObserver.onNext(empResp);

        // Mark the process as completed
        responseObserver.onCompleted();
    }

}
