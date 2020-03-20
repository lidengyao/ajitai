package com.hxsoft.ajitai.model.info;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MoneyRule_Total_Info implements Serializable {

    /**
     * id : 2
     * activity_id : 1
     * status : 1
     * total_money : 10000.00
     * balance_money : 0.00
     * user_per_money : 285.00
     * rules : {"read_rule":{"items":[{"number":5,"reward_money":"5.00"},{"number":15,"reward_money":"15.00"},{"number":20,"reward_money":"50.00"}],"max_limit":"50.00"},"sign_rule":{"items":[{"number":5,"reward_money":"10.00"},{"number":10,"reward_money":"50.00"}],"max_limit":"50.00"},"order_rule":{"items":[{"number":5,"reward_money":"50.00"},{"number":10,"reward_money":"200.00"}],"max_limit":"200.00"}}
     */

    private int id;
    private int activity_id;
    private int status;
    private String total_money;
    private String balance_money;
    private String user_per_money;
    private RulesBean rules;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(int activity_id) {
        this.activity_id = activity_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTotal_money() {
        return total_money;
    }

    public void setTotal_money(String total_money) {
        this.total_money = total_money;
    }

    public String getBalance_money() {
        return balance_money;
    }

    public void setBalance_money(String balance_money) {
        this.balance_money = balance_money;
    }

    public String getUser_per_money() {
        return user_per_money;
    }

    public void setUser_per_money(String user_per_money) {
        this.user_per_money = user_per_money;
    }

    public RulesBean getRules() {
        return rules;
    }

    public void setRules(RulesBean rules) {
        this.rules = rules;
    }

    public static class RulesBean implements Serializable{
        /**
         * read_rule : {"items":[{"number":5,"reward_money":"5.00"},{"number":15,"reward_money":"15.00"},{"number":20,"reward_money":"50.00"}],"max_limit":"50.00"}
         * sign_rule : {"items":[{"number":5,"reward_money":"10.00"},{"number":10,"reward_money":"50.00"}],"max_limit":"50.00"}
         * order_rule : {"items":[{"number":5,"reward_money":"50.00"},{"number":10,"reward_money":"200.00"}],"max_limit":"200.00"}
         */

        private ReadRuleBean read_rule;
        private SignRuleBean sign_rule;
        private OrderRuleBean order_rule;

        public ReadRuleBean getRead_rule() {
            return read_rule;
        }

        public void setRead_rule(ReadRuleBean read_rule) {
            this.read_rule = read_rule;
        }

        public SignRuleBean getSign_rule() {
            return sign_rule;
        }

        public void setSign_rule(SignRuleBean sign_rule) {
            this.sign_rule = sign_rule;
        }

        public OrderRuleBean getOrder_rule() {
            return order_rule;
        }

        public void setOrder_rule(OrderRuleBean order_rule) {
            this.order_rule = order_rule;
        }

        public static class ReadRuleBean implements Serializable{
            /**
             * items : [{"number":5,"reward_money":"5.00"},{"number":15,"reward_money":"15.00"},{"number":20,"reward_money":"50.00"}]
             * max_limit : 50.00
             */

            private String max_limit;
            private List<ItemsBean> items;

            public String getMax_limit() {
                return max_limit;
            }

            public void setMax_limit(String max_limit) {
                this.max_limit = max_limit;
            }

            public List<ItemsBean> getItems() {
                return items;
            }

            public void setItems(List<ItemsBean> items) {
                this.items = items;
            }

            public static class ItemsBean {
                /**
                 * number : 5
                 * reward_money : 5.00
                 */

                private int number;
                private String reward_money;

                public int getNumber() {
                    return number;
                }

                public void setNumber(int number) {
                    this.number = number;
                }

                public String getReward_money() {
                    return reward_money;
                }

                public void setReward_money(String reward_money) {
                    this.reward_money = reward_money;
                }
            }
        }

        public static class SignRuleBean  implements Serializable{
            /**
             * items : [{"number":5,"reward_money":"10.00"},{"number":10,"reward_money":"50.00"}]
             * max_limit : 50.00
             */

            private String max_limit;
            private List<ItemsBeanX> items;

            public String getMax_limit() {
                return max_limit;
            }

            public void setMax_limit(String max_limit) {
                this.max_limit = max_limit;
            }

            public List<ItemsBeanX> getItems() {
                return items;
            }

            public void setItems(List<ItemsBeanX> items) {
                this.items = items;
            }

            public static class ItemsBeanX {
                /**
                 * number : 5
                 * reward_money : 10.00
                 */

                private int number;
                private String reward_money;

                public int getNumber() {
                    return number;
                }

                public void setNumber(int number) {
                    this.number = number;
                }

                public String getReward_money() {
                    return reward_money;
                }

                public void setReward_money(String reward_money) {
                    this.reward_money = reward_money;
                }
            }
        }

        public static class OrderRuleBean  implements Serializable{
            /**
             * items : [{"number":5,"reward_money":"50.00"},{"number":10,"reward_money":"200.00"}]
             * max_limit : 200.00
             */

            private String max_limit;
            private ArrayList<ItemsBeanXX> items;

            public String getMax_limit() {
                return max_limit;
            }

            public void setMax_limit(String max_limit) {
                this.max_limit = max_limit;
            }

            public ArrayList<ItemsBeanXX> getItems() {
                return items;
            }

            public void setItems(ArrayList<ItemsBeanXX> items) {
                this.items = items;
            }

            public static class ItemsBeanXX {
                /**
                 * number : 5
                 * reward_money : 50.00
                 */

                private int number;
                private String reward_money;

                public int getNumber() {
                    return number;
                }

                public void setNumber(int number) {
                    this.number = number;
                }

                public String getReward_money() {
                    return reward_money;
                }

                public void setReward_money(String reward_money) {
                    this.reward_money = reward_money;
                }
            }
        }
    }
}

