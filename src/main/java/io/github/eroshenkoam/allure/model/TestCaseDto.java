package io.github.eroshenkoam.allure.model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Data
@Accessors(chain = true)
public class TestCaseDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private long id;
    private String name;
    private boolean automated;

    private List<TestCaseStepDto> steps;

}
