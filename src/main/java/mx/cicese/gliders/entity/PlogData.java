package mx.cicese.gliders.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "plog")
public class PlogData {
	
	@Id
	private Integer id;
	
	@Column(name = "Glider")
	private String glider;
	
	private String mision;
	
	private Integer dive;
	
	@Column(name = "current_avaraged")
	private String currentAveraged;
	
	@Column(name = "current_degrees")
	private String currentDegrees;
	
	@Column(name = "tgt_name")
	private String tgtName;
	
	@Column(name = "latitud_tgt")
	private String tgtLatitud;
	
	@Column(name = "longitud_tgt")
	private String tgtLongitud;
	
	@Column(name = "ah_24v")
	private String ah24v;
	
	@Column(name = "ah_24amp")
	private String ah24vAmp;
	
	private Double amphr;
	
	@Column(name = "ah_10v")
	private String ah10v;
	
	@Column(name = "MINV_24V")
	private Double minV24v;
	
	@Column(name = "MINV_10V")
	private Double minV10v;
	
	
	private Double humid;
	
	@Column(name = "int_pressure")
	private Double intPressure;
	
	@Column(name = "tcm_temp")
	private Double tcmTemp;
	
	@Column(name = "error_buffer_overruns")
	private Integer errorBufferOverruns;
	
	@Column(name = "error_spurious_interrupts")
	private Integer errorSpuriousInterrupts;
	
	@Column(name = "error_cf8_opening")
	private Integer errorCf8Opening;
	
	@Column(name = "error_cf8_writing")
	private Integer errorCf8OWriting;
	
	@Column(name = "error_cf8_closing")
	private Integer errorCf8OClosing;
	
	@Column(name = "error_cf8_retries_opening")
	private Integer errorCf8ORetriesOpening;
	
	@Column(name = "error_cf8_retries_writing")
	private Integer errorCf8ORetriesWriting;
	
	@Column(name = "error_cf8_retries_closing")
	private Integer errorCf8ORetriesClosing;
	
	@Column(name = "error_pitch")
	private Integer errorPitch;
	
	@Column(name = "error_roll")
	private Integer errorRoll;
	
	@Column(name = "error_vbd")
	private Integer errorVbd;
	
	@Column(name = "error_pitch_retries")
	private Integer errorPitchRetries;
	
	@Column(name = "error_rollretries")
	private Integer errorRollEntries;
	
	@Column(name = "error_vbd_retries")
	private Integer errorVbdRetries;
	
	@Column(name = "error_gps_not_provide-data")
	private Integer errorGpsNotProvideData;
	
	@Column(name = "error_sensor_time_outs")
	private Integer errorSensorTimeOuts;
	
	private Double rho;
	
	private Double finish;
	
	private String fecha;
	
	@Column(name = "sm_cc")
	private Double smcc;
	
	@Column(name = "gps_latitud")
	private String gpsLatitud;
	
	@Column(name = "gps_longitud")
	private String gpsLongitud;
	
	@Column(name = "gps_fecha")
	private String gpsFecha;
	
	@Column(name = "gps_hora")
	private String gpsHora;
	
	@Column(name = "gps2_latitud")
	private String gps2Latitud;
	
	@Column(name = "gps2_longitud")
	private String gps2Longitud;
	
	@Column(name = "gps2_fecha")
	private String gps2Fecha;
	
	@Column(name = "gps2_hora")
	private String gps2Hora;
	
	@Column(name = "fecha_orden")
	private Date fechaOrden;
	

}
