package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;

/** =====================================================
 * DTMF received on a channel.
 * 
 * This event is sent when the DTMF ends. There is no notification about the start of DTMF
 * 
 * Defined in file :events.json
 * ====================================================== */
public class ChannelDtmfReceived_impl_ari_0_0_1 extends Event_impl_ari_0_0_1 implements ChannelDtmfReceived, java.io.Serializable {
  /**  The channel on which DTMF was received  */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 public void setChannel(Channel val ) {
   channel = val;
 }

  /**  DTMF digit received (0-9, A-E, # or *)  */
  private String digit;
 public String getDigit() {
   return digit;
 }

 public void setDigit(String val ) {
   digit = val;
 }

  /**  Number of milliseconds DTMF was received  */
  private int duration_ms;
 public int getDuration_ms() {
   return duration_ms;
 }

 public void setDuration_ms(int val ) {
   duration_ms = val;
 }

}
