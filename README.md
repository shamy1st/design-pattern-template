# Template Method Design Pattern (Java)
**Template Method** define a template for an operation.
![](https://github.com/shamy1st/design-pattern-template/blob/main/uml.png)
### Problem: 
You have **TransferMoney** task and **GenerateReport** task, both share common step to call **auditTrail.record()** then their own task execute.

**Two Issues:**
1. Redundant code.
2. When adding new task, no one will force to follow the task structure and do the common step.

**

    public class TransferMoneyTask {
        private AuditTrail auditTrail;

        public TransferMoneyTask(AuditTrail auditTrail) {
            this.auditTrail = auditTrail;
        }
        
        public void execute() {
            auditTrail.record();
            doExecute();
        }
        
        private void doExecute() {
            System.out.println("Transfer Money");
        }
    }

    public class GenerateReportTask {
        private AuditTrail auditTrail;

        public GenerateReportTask(AuditTrail auditTrail) {
            this.auditTrail = auditTrail;
        }
        
        public void execute() {
            auditTrail.record();
            doExecute();
        }
        
        private void doExecute() {
            System.out.println("Generate Report");
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-template/blob/main/uml-solution.png)
