import java.util.ArrayList;
public class StepTracker
{
 private int minStep;
 private int steps;
 private int days;
 private int active;
 public StepTracker(int x){
  minStep = x;
  steps = 0;
  days = 0;
  active = 0;
 }
 public void addDailySteps(int x){
  steps+=x;
  days++;
  if(x>=minStep){
   active++;
  }
 }
 public int activeDays(){
  return active;
 }
 public double averageSteps(){
  return (double)steps/days;
 }
} 
