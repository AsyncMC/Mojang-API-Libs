@isTest
private class OASNameChangeTest {
    @isTest
    private static void equalsSameInstance() {
        OASNameChange nameChange1 = OASNameChange.getExample();
        OASNameChange nameChange2 = nameChange1;
        OASNameChange nameChange3 = new OASNameChange();
        OASNameChange nameChange4 = nameChange3;

        System.assert(nameChange1.equals(nameChange2));
        System.assert(nameChange2.equals(nameChange1));
        System.assert(nameChange1.equals(nameChange1));
        System.assert(nameChange3.equals(nameChange4));
        System.assert(nameChange4.equals(nameChange3));
        System.assert(nameChange3.equals(nameChange3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNameChange nameChange1 = OASNameChange.getExample();
        OASNameChange nameChange2 = OASNameChange.getExample();
        OASNameChange nameChange3 = new OASNameChange();
        OASNameChange nameChange4 = new OASNameChange();

        System.assert(nameChange1.equals(nameChange2));
        System.assert(nameChange2.equals(nameChange1));
        System.assert(nameChange3.equals(nameChange4));
        System.assert(nameChange4.equals(nameChange3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNameChange nameChange1 = OASNameChange.getExample();
        OASNameChange nameChange2 = new OASNameChange();

        System.assertEquals(false, nameChange1.equals('foo'));
        System.assertEquals(false, nameChange2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNameChange nameChange1 = OASNameChange.getExample();
        OASNameChange nameChange2 = new OASNameChange();
        OASNameChange nameChange3;

        System.assertEquals(false, nameChange1.equals(nameChange3));
        System.assertEquals(false, nameChange2.equals(nameChange3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNameChange nameChange1 = OASNameChange.getExample();
        OASNameChange nameChange2 = new OASNameChange();

        System.assertEquals(nameChange1.hashCode(), nameChange1.hashCode());
        System.assertEquals(nameChange2.hashCode(), nameChange2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNameChange nameChange1 = OASNameChange.getExample();
        OASNameChange nameChange2 = OASNameChange.getExample();
        OASNameChange nameChange3 = new OASNameChange();
        OASNameChange nameChange4 = new OASNameChange();

        System.assert(nameChange1.equals(nameChange2));
        System.assert(nameChange3.equals(nameChange4));
        System.assertEquals(nameChange1.hashCode(), nameChange2.hashCode());
        System.assertEquals(nameChange3.hashCode(), nameChange4.hashCode());
    }
}
