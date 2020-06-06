@isTest
private class OASAgentTest {
    @isTest
    private static void equalsSameInstance() {
        OASAgent agent1 = OASAgent.getExample();
        OASAgent agent2 = agent1;
        OASAgent agent3 = new OASAgent();
        OASAgent agent4 = agent3;

        System.assert(agent1.equals(agent2));
        System.assert(agent2.equals(agent1));
        System.assert(agent1.equals(agent1));
        System.assert(agent3.equals(agent4));
        System.assert(agent4.equals(agent3));
        System.assert(agent3.equals(agent3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAgent agent1 = OASAgent.getExample();
        OASAgent agent2 = OASAgent.getExample();
        OASAgent agent3 = new OASAgent();
        OASAgent agent4 = new OASAgent();

        System.assert(agent1.equals(agent2));
        System.assert(agent2.equals(agent1));
        System.assert(agent3.equals(agent4));
        System.assert(agent4.equals(agent3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAgent agent1 = OASAgent.getExample();
        OASAgent agent2 = new OASAgent();

        System.assertEquals(false, agent1.equals('foo'));
        System.assertEquals(false, agent2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAgent agent1 = OASAgent.getExample();
        OASAgent agent2 = new OASAgent();
        OASAgent agent3;

        System.assertEquals(false, agent1.equals(agent3));
        System.assertEquals(false, agent2.equals(agent3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAgent agent1 = OASAgent.getExample();
        OASAgent agent2 = new OASAgent();

        System.assertEquals(agent1.hashCode(), agent1.hashCode());
        System.assertEquals(agent2.hashCode(), agent2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAgent agent1 = OASAgent.getExample();
        OASAgent agent2 = OASAgent.getExample();
        OASAgent agent3 = new OASAgent();
        OASAgent agent4 = new OASAgent();

        System.assert(agent1.equals(agent2));
        System.assert(agent3.equals(agent4));
        System.assertEquals(agent1.hashCode(), agent2.hashCode());
        System.assertEquals(agent3.hashCode(), agent4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAgent agent = new OASAgent();
        System.assertEquals(NameEnum.MINECRAFT, agent.name);
        System.assertEquals(1, agent.version);
    }
}
