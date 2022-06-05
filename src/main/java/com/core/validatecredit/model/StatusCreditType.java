package com.core.validatecredit.model;

import java.util.stream.Stream;

public enum StatusCreditType {
    ACTIVE(0L),
    OVERDUE(1L),
    DEFAULTER(2L),
    PENALIZE(3L),
    DISABLED(4L),
    PAID(5L);

    private Long type;
	
	private StatusCreditType(Long type) {
		this.type=type;
	}

	public static StatusCreditType fetchStatusCreditType(final Long type) {
		return Stream.of(StatusCreditType.values())
        .filter(targetEnum -> targetEnum.type.equals(type)).findFirst()
        .orElse(DISABLED);
	}
	
	public Long getCode() {
		return type;
	}
    
}
