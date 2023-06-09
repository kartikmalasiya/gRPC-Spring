package com.techgeeknext.employee.service;

import com.techgeeknext.employee.entity.EmployeeEntity;
import com.techgeeknext.employee.repository.EmployeeRepository;
import com.techgeeknext.constants.Role;
import com.techgeeknext.employee.EmployeeRequest;
import com.techgeeknext.employee.EmployeeResponse;
import com.techgeeknext.employee.CreateEmployeeRequest;
import com.techgeeknext.employee.CreateEmployeeResponse;
import com.techgeeknext.employee.EmployeeDeleteRequest;
import com.techgeeknext.employee.EmployeeDeleteResponse;
import com.techgeeknext.employee.EmployeeUpdateRequest;
import com.techgeeknext.employee.EmployeeUpdateResponse;
import com.techgeeknext.employee.EmployeeServiceGrpc;
import com.techgeeknext.employee.EmployeeUpdateServiceGrpc;
import com.techgeeknext.employee.CreateEmployeeServiceGrpc;
import com.techgeeknext.employee.EmployeeDeleteServiceGrpc;
import com.techgeeknext.employee.repository.EmployeeRepository;
import io.grpc.stub.StreamObserver;
import lombok.*;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
@AllArgsConstructor
public class DeleteEmployeeService  extends EmployeeDeleteServiceGrpc.EmployeeDeleteServiceImplBase {
    @Override
    public void deleteEmployee(EmployeeDeleteRequest request, StreamObserver<EmployeeDeleteResponse> responseObserver) {
        // Extract employee ID from the request
        String empId = request.getEmpId();

        // Perform the necessary logic to delete the employee from the database
        // For this example, we'll assume the employee is successfully deleted
        // You should replace this code with the actual logic to delete the employee from your database

        // Assuming the employee deletion is successful, create the response object
        EmployeeDeleteResponse deleteResponse = EmployeeDeleteResponse.newBuilder()
                .setEmpId(empId)
                .setSuccess(true)
                .build();

        // Send the response object back to the client
        responseObserver.onNext(deleteResponse);

        // Mark the process as completed
        responseObserver.onCompleted();
    }
}
