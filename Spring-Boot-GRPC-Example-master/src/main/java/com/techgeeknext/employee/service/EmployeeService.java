package com.techgeeknext.employee.service;

import com.techgeeknext.employee.entity.EmployeeEntity;
import com.techgeeknext.employee.repository.EmployeeRepository;
import com.techgeeknext.constants.Role;
import com.techgeeknext.employee.EmployeeRequest;
import com.techgeeknext.employee.EmployeeResponse;
import com.techgeeknext.employee.CreateEmployeeRequest;
import com.techgeeknext.employee.CreateEmployeeResponse;
import com.techgeeknext.employee.EmployeeServiceGrpc;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Optional;

@GrpcService
@AllArgsConstructor
public class EmployeeService extends EmployeeServiceGrpc.EmployeeServiceImplBase {

    //private final EmployeeRepository employeeRepository;
    @Override
    public void getEmployee(EmployeeRequest request,
                            StreamObserver<EmployeeResponse> responseObserver) {


        //Optional<EmployeeEntity> optionalEmployee = employeeRepository.findById(request.getEmpId());

       // String name = optionalEmployee.get().getName();
        EmployeeResponse empResp = EmployeeResponse
                .newBuilder()
                .setEmpId(request.getEmpId())
                .setName("ABC")
                .build();

        //set the response object
        responseObserver.onNext(empResp);

        //mark process is completed
        responseObserver.onCompleted();
    }



}
