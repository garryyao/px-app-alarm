package com.ge.predix.solsvc.training.alarmservice.jpa.init;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ge.predix.solsvc.training.alarmservice.entity.AlarmEventEntity;
import com.ge.predix.solsvc.training.alarmservice.entity.HospitalEntity;
import com.ge.predix.solsvc.training.alarmservice.entity.PatientEntity;
import com.ge.predix.solsvc.training.alarmservice.repository.IAlarmEventEntityRepository;
import com.ge.predix.solsvc.training.alarmservice.repository.IHospitalEntityRepository;
import com.ge.predix.solsvc.training.alarmservice.repository.IPatientEntityRepository;

@Component
public class InitAlarmServiceData {
	
	@Autowired
	private IAlarmEventEntityRepository alarmService;

	@Autowired
	private IPatientEntityRepository patientService;
	
	@Autowired
	private IHospitalEntityRepository hospitalRepo;
	
	
	@PostConstruct
	public void initAlarmServiceData(){
		HospitalEntity he = new HospitalEntity();
		he.setAddress("Hua tuo Road, #1");
		he.setPhone("18601611218");
		he.setName("Garry Yao - Frontend Engineer");
		he.setEmail("garry.yao@ge.com");
		hospitalRepo.save(he);
		
		PatientEntity pe = new PatientEntity(1, "Mike", "", "Waldman", "mike.waldman@ge.com", "", null);
		patientService.save(pe);
		
		List<AlarmEventEntity> eList = new ArrayList<AlarmEventEntity>();
		AlarmEventEntity e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "PVC", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "COUPLET", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "PVC", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 PROBE", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "COUPLET", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 PROBE", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 MOTION DET", "TECHNICAL", 0);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 MOTION DET", "TECHNICAL", 0);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 PROBE", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 PROBE", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "PVC", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 PROBE", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "PVC", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "CHNGE BATTERY", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "PVC", "ARRHYTHMIA", 4);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 MOTION DET", "TECHNICAL", 0);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 MOTION DET", "TECHNICAL", 0);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 PROBE", "TECHNICAL", 2);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "ARTIFACT", "TECHNICAL", 1);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);
		e = new AlarmEventEntity(1, "SPO2 LO", "PARAMETER", 6);
		eList.add(e);	
		alarmService.save(eList);
		
	}
	
}
