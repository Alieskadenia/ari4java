package ch.loway.oss.ari4java.generated.ari_1_8_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Jan 30 13:39:05 CET 2016
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Notification that an attended transfer has occurred.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class BridgeAttendedTransfer_impl_ari_1_8_0 extends Event_impl_ari_1_8_0 implements BridgeAttendedTransfer, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Application that has been transferred into  */
  private String destination_application;
 public String getDestination_application() {
   return destination_application;
 }

 @JsonDeserialize( as=String.class )
 public void setDestination_application(String val ) {
   destination_application = val;
 }

  /**  Bridge that survived the merge result  */
  private String destination_bridge;
 public String getDestination_bridge() {
   return destination_bridge;
 }

 @JsonDeserialize( as=String.class )
 public void setDestination_bridge(String val ) {
   destination_bridge = val;
 }

  /**  First leg of a link transfer result  */
  private Channel destination_link_first_leg;
 public Channel getDestination_link_first_leg() {
   return destination_link_first_leg;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_8_0.class )
 public void setDestination_link_first_leg(Channel val ) {
   destination_link_first_leg = val;
 }

  /**  Second leg of a link transfer result  */
  private Channel destination_link_second_leg;
 public Channel getDestination_link_second_leg() {
   return destination_link_second_leg;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_8_0.class )
 public void setDestination_link_second_leg(Channel val ) {
   destination_link_second_leg = val;
 }

  /**  Bridge that survived the threeway result  */
  private Bridge destination_threeway_bridge;
 public Bridge getDestination_threeway_bridge() {
   return destination_threeway_bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_8_0.class )
 public void setDestination_threeway_bridge(Bridge val ) {
   destination_threeway_bridge = val;
 }

  /**  Transferer channel that survived the threeway result  */
  private Channel destination_threeway_channel;
 public Channel getDestination_threeway_channel() {
   return destination_threeway_channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_8_0.class )
 public void setDestination_threeway_channel(Channel val ) {
   destination_threeway_channel = val;
 }

  /**  How the transfer was accomplished  */
  private String destination_type;
 public String getDestination_type() {
   return destination_type;
 }

 @JsonDeserialize( as=String.class )
 public void setDestination_type(String val ) {
   destination_type = val;
 }

  /**  Whether the transfer was externally initiated or not  */
  private boolean is_external;
 public boolean getIs_external() {
   return is_external;
 }

 @JsonDeserialize( as=boolean.class )
 public void setIs_external(boolean val ) {
   is_external = val;
 }

  /**  The channel that is replacing transferer_first_leg in the swap  */
  private Channel replace_channel;
 public Channel getReplace_channel() {
   return replace_channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_8_0.class )
 public void setReplace_channel(Channel val ) {
   replace_channel = val;
 }

  /**  The result of the transfer attempt  */
  private String result;
 public String getResult() {
   return result;
 }

 @JsonDeserialize( as=String.class )
 public void setResult(String val ) {
   result = val;
 }

  /**  The channel that is being transferred to  */
  private Channel transfer_target;
 public Channel getTransfer_target() {
   return transfer_target;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_8_0.class )
 public void setTransfer_target(Channel val ) {
   transfer_target = val;
 }

  /**  The channel that is being transferred  */
  private Channel transferee;
 public Channel getTransferee() {
   return transferee;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_8_0.class )
 public void setTransferee(Channel val ) {
   transferee = val;
 }

  /**  First leg of the transferer  */
  private Channel transferer_first_leg;
 public Channel getTransferer_first_leg() {
   return transferer_first_leg;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_8_0.class )
 public void setTransferer_first_leg(Channel val ) {
   transferer_first_leg = val;
 }

  /**  Bridge the transferer first leg is in  */
  private Bridge transferer_first_leg_bridge;
 public Bridge getTransferer_first_leg_bridge() {
   return transferer_first_leg_bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_8_0.class )
 public void setTransferer_first_leg_bridge(Bridge val ) {
   transferer_first_leg_bridge = val;
 }

  /**  Second leg of the transferer  */
  private Channel transferer_second_leg;
 public Channel getTransferer_second_leg() {
   return transferer_second_leg;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_8_0.class )
 public void setTransferer_second_leg(Channel val ) {
   transferer_second_leg = val;
 }

  /**  Bridge the transferer second leg is in  */
  private Bridge transferer_second_leg_bridge;
 public Bridge getTransferer_second_leg_bridge() {
   return transferer_second_leg_bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_8_0.class )
 public void setTransferer_second_leg_bridge(Bridge val ) {
   transferer_second_leg_bridge = val;
 }

/** No missing signatures from interface */
}

