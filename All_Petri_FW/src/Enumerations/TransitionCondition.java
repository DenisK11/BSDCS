package Enumerations;

import java.io.Serializable;

public enum TransitionCondition implements Serializable{
	Undefined,
	Equal,
	NotEqual,
	MoreThan,
	MoreThanOrEqual,
	LessThan,
	LessThanOrEqual,
	Contains,
	NotContains,
	IsNull,
	NotNull,
	HaveCarForMe,
	CanAddCars,
	CanNotAddCars,
	HaveCar,
	HaveREL,
	SubPetriStopped,
	HavePriorityCar,
	IsPriorityCar,
	isBus,
	isTaxi,
	HaveBus,
	HaveTaxi,
	Bus,
	DataBus,

	
	Equal_FloatFloat,            //the transition conditions for floatfloat
	MoreThan_FloatFloat,         //the transition conditions for floatfloat
	MoreThanOrEqual_FloatFloat,  //the transition conditions for floatfloat
	LessThan_FloatFloat,         //the transition conditions for floatfloat
	LessThanOrEqual_FloatFloat,  //the transition conditions for floatfloat
}
